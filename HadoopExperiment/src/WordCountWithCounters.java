/*
 * Learning MapReduce by Nitesh Jain 
 * */
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * @author nj
 *
 */
public class WordCountWithCounters extends Configured
implements Tool
{
  @Override
  public int run(String[] args) throws Exception 
  {
	  Configuration conf = new Configuration();
	  Job job = new Job(conf);
	  
	  job.setJarByClass(WordCountWithCounters.class);
	  job.setJobName("Word Count With Counters");
	  
	  job.setMapperClass(WordCountMapWithCounters.class);
	  job.setCombinerClass(WordCountReducer.class);
	  job.setReducerClass(WordCountReducer.class);
	  
	  job.setMapOutputKeyClass(Text.class);
	  job.setMapOutputValueClass(IntWritable.class);
	  job.setInputFormatClass(TextInputFormat.class);
	  

	  FileInputFormat.addInputPath(job, new Path(args[0]));
	  FileOutputFormat.setOutputPath(job, new Path(args[1]));
      job.setNumReduceTasks(2);
	  return job.waitForCompletion(true) ? 0 : 1;
   }
 
  public static void main(String[] args) throws Exception 
  {
    int exitCode = ToolRunner.run(new Configuration(), new WordCountWithCounters(), args);
    System.exit(exitCode);
  }

}