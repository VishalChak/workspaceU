

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;



/**
 * 
 * @author sreenivasrao.m
 *
 */
public class FileUtil {

	/**
	 * Logger
	 */
	//private static final Logger LOG = Logger.getLogger(FileUtil.class);
	/**
	 * Move a file from one directory to another
	 * @param sSourceFilePath				:Path of the file to move
	 * @param sDestinationDirectoryPath 	:Path of the directoy to move the file to
	 * If the destination directory doesn't exists it will create it.
	 */
	public static boolean moveFile(String sSourceFilePath,String sDestinationDirectoryPath) {
		boolean isSuccess=false;
		File oSourceFile = new File(sSourceFilePath);
		if(oSourceFile.exists()) {
			//if dest dir not found create
			File oDestinationFolder = new File(sDestinationDirectoryPath);
			if(!oDestinationFolder.isDirectory())
				oDestinationFolder.mkdirs();
			
			isSuccess = oSourceFile.renameTo(new File(oDestinationFolder, oSourceFile.getName()));
			if(!isSuccess) {
				//LOG.error("Unable to move the file : "+oSourceFile.getName()+" to "+oDestinationFolder);
			} else {
//				if( LOG.isInfoEnabled() )
//					LOG.info("Moved the file :"+oSourceFile.getName()+" to "+oDestinationFolder);
			}
		}
		else {
			//LOG.error("Failed while moving the file :"+sSourceFilePath+", because it doesnot exists");
		}
		return isSuccess;
	}
		
	
	public static boolean moveFileTodir(String sSourceFilePath,String sDestinationDirectoryPath) {
		boolean isSuccess=false;
		File oSourceFile = new File(sSourceFilePath);
		if(oSourceFile.exists()) {
			//if dest dir not found create
			File oDestinationFolder = new File(sDestinationDirectoryPath);
			if(!oDestinationFolder.isDirectory())
				oDestinationFolder.mkdirs();
			try {
				copyFiletoDirectory(oSourceFile, oDestinationFolder);
				oSourceFile.delete();
				isSuccess=true;
			} catch (IOException e) {
				//LOG.error(e.getMessage(),e);
			}
			if(!isSuccess) {
				//LOG.error("Unable to move the file : "+oSourceFile.getName()+" to "+oDestinationFolder);
			} else {
//				if( LOG.isInfoEnabled() )
//					LOG.info("Moved the file :"+oSourceFile.getName()+" to "+oDestinationFolder);
			}
		} else {
			//LOG.error("Failed while moving the file :"+sSourceFilePath+", because it doesnot exists");
		}
		return isSuccess;
	}
	
	public static void copyFiletoFile(File source,File destination) throws IOException {
		FileChannel inputChannel = null;
		FileChannel outputChannel = null;
		String destPath = destination.getParent();
		File destFolderPath = new File(destPath);
		if(!destFolderPath.exists()){
			destFolderPath.mkdirs();
		}
		try {
			inputChannel = new FileInputStream(source).getChannel();
			outputChannel = new FileOutputStream(destination).getChannel();
			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		} finally {
			if(inputChannel != null){
				inputChannel.close();
			}
			if(outputChannel != null){
				outputChannel.close();
			}
		}
	}
	
public static void copyFiletoDirectory(File source, File destination) throws IOException {
		if(!destination.exists()) {
			destination.mkdirs();
		}
	    copyFiletoFile( source, new File(destination.getPath() + File.separator + source.getName()));
	}
	
	public static void copyFilestoDirectory(File srcPath, File destination) throws IOException {
		if(!destination.exists()) {
			destination.mkdirs();
		}
		String files[] = srcPath.list();
		for(int i = 0; i < files.length; i++) {
			File sourceFile = new File(srcPath + File.separator + files[i]);
			File destFile = new File(destination.getPath() + File.separator + sourceFile.getName());
			if(!destFile.exists() && !sourceFile.isDirectory()){
				copyFiletoFile( sourceFile, destFile);
			}
        }
	    
	}
	
	public static void copyDirectory(File srcPath,File dstPath) throws IOException {
		if (srcPath.isDirectory()) {
			if (!dstPath.exists()) {
				dstPath.mkdirs();
	        }
	        String files[] = srcPath.list();
	        for(int i = 0; i < files.length; i++) {
	           copyDirectory(new File(srcPath, files[i]), new File(dstPath, files[i]));
	        }
		} else {
	  		if(!srcPath.exists()) {
	  			//LOG.error("File or directory does not exist.");
	  		} else {
	  			copyFiletoFile(srcPath,dstPath);
	  		}
		}
	}
	
	public static void moveDirectory(File srcPath,File dstPath) throws IOException {
		if (srcPath.isDirectory()) {
			if (!dstPath.exists()) {
	           dstPath.mkdirs();
	        }
	        String files[] = srcPath.list();
	        for(int i = 0; i < files.length; i++) {
	        	moveDirectory(new File(srcPath, files[i]), new File(dstPath, files[i]));
	        }
	        deleteDir(srcPath);
		} else {
			if(!srcPath.exists()) {
				//LOG.error("File or directory does not exist.");
	  		} else {
	  			moveFile(srcPath,dstPath);
	  		}
      }  
	}
	
	private static void moveFile(File srcPath, File dstPath) {
		srcPath.renameTo(dstPath);
	}

	//this method deletes the directory recursively
	public static boolean deleteDir(File dir) {
	    if (dir.isDirectory()) {
	    	String[] children = dir.list();
	    	for (int i = 0; i < children.length; i++) {
	    		boolean success = deleteDir(new File(dir, children[i]));
	    		if (!success) {
	    			return false;
	    		}
	    	}
	    }
	    return dir.delete();
	}

	//Sorts the files on Last Modified date and returns in descending order
	public static File[]  sortFilesOnLastModifiedDate(File[] files) {
		Arrays.sort( files, new Comparator<File>() {
			public int compare(File f1, File f2) {
				return new Long(f1.lastModified()).compareTo(f2.lastModified());
			}
		});
		return files;
	}
	
	public static void setHiddenProperty(File file){
		try {
			Process p = Runtime.getRuntime().exec("attrib +H " + file.getPath());
			p.waitFor();
		} catch (IOException ie) {
			//LOG.error(ie.getMessage(), ie);
		} catch (InterruptedException iex) {
			//LOG.error(iex.getMessage(), iex);
		}
	    
	}
	
	public static void deleteAllFilesInDir(String folderPath){
		File directory = new File(folderPath);
		if(directory.isDirectory()){
			File[] files = directory.listFiles();
			for(File file : files){
				file.delete();
			}
		}
		if(directory.isFile()){
			directory.delete();
		}
	}
	
	/**
	 * Unzip it
	 * 
	 * @param zipFile
	 *            input zip file
	 * @param output
	 *            zip file output folder
	 */
	/*public static void unZipFile(String zipSource, String outputFolder) {
		try {
			ZipFile zipFile = new ZipFile(zipSource);
			zipFile.extractAll(outputFolder);
		} catch (ZipException e) {
			//LOG.error(e.getMessage(), e);
		}
	}*/
	
	public static void createZipFile(String srcDir, String destZipFile) {
		try {
			ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(destZipFile));
			File srcFile = new File(srcDir);
			for (File file : srcFile.listFiles()) {
				if (file.isDirectory()) {
					addFolderToZip(file, file.getName(), zos);
				} else {
					addFileToZip(file, zos);
				}
			}
			zos.flush();
			zos.close();
		} catch (Exception ffe) {
			//LOG.error(ffe.getMessage(), ffe);
		}
	}

	private static void addFolderToZip(File folder, String parentFolder, ZipOutputStream zos) {
		try {
			for (File file : folder.listFiles()) {
				if (file.isDirectory()) {
					addFolderToZip(file, parentFolder + "/" + file.getName(), zos);
					continue;
				}
				zos.putNextEntry(new ZipEntry(parentFolder + "/" + file.getName()));
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				byte[] bytesIn = new byte[4096];
				int read = 0;
				while ((read = bis.read(bytesIn)) != -1) {
					zos.write(bytesIn, 0, read);
				}
				zos.closeEntry();
				bis.close();
			}

		} catch (Exception ffe) {
			//LOG.error(ffe.getMessage(), ffe);
		}
	}

	private static void addFileToZip(File file, ZipOutputStream zos) {
		try {
			zos.putNextEntry(new ZipEntry(file.getName()));
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			byte[] bytesIn = new byte[4096];
			int read = 0;
			while ((read = bis.read(bytesIn)) != -1) {
				zos.write(bytesIn, 0, read);
			}
			zos.closeEntry();
			bis.close();
		} catch (Exception ffe) {
			//LOG.error(ffe.getMessage(), ffe);
		}
	}
	
	public static void createFolder(String folderName){
		File folder = new File(folderName);
		if(!folder.isDirectory()){
			folder.mkdirs();
		}
	}
	
	public static String createDir(String folderName){
		File folder = new File(folderName);
		if(!folder.isDirectory()){
			folder.mkdirs();
		}
		return folder.getAbsolutePath();
	}
	
	public static void deleteFile(String filePath){
		File file = new File(filePath);
		if(file.exists()){
			if(!file.delete()){
				//LOG.error("File not deleted :"+ file.getAbsolutePath());
			}
		}else{
			//LOG.error("File not exists :"+ file.getAbsolutePath());
		}
	}
	
	/**
	 * 
	 * @param dirPath
	 * @param fileSet
	 * {@code
	 * 	example: Set<String> fileSet = new TreeSet<String>();
	 * }
	 * @return set collection
	 * 
	 */
	public static Set<String> getFilesPathInDir(File dirPath, Set<String> fileSet){
		if(dirPath.exists() && dirPath.isDirectory()){
			File[] files = dirPath.listFiles();
			for (File file : files) {
				if(file.isDirectory()){
					getFilesPathInDir(file, fileSet);
				} else {
					fileSet.add(file.getAbsolutePath());
				}
			}
		} else {
			fileSet.add(dirPath.getAbsolutePath());
		}
		return fileSet;
	}
	
	public static Boolean isDirectoryExists(String dirPath){
		File file = new File(dirPath);
		if(file.exists() &&  file.isDirectory()){
			return true;
		}
		return false;
	}
	

}
