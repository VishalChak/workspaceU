;(function($) {
    index = {};
    index.home = {
    	init:function(){
    		$(document).off("click", "img[name='eleImg']").on("click", "img[name='eleImg']",function(){
    			alert("Vishal");
    		});
    		$(document).off("click", "#sevicesProviderSpan").on("click", "#sevicesProviderSpan",function(){
    			$("#sevicesProviderSec").show();
    			$("#customerSec").hide();
    		});
    		$(document).off("click", "#customerLi").on("click", "#customerLi",function(){
    			$("#customerSec").show();
    			$("#sevicesProviderSec").hide();
    		});
    		$(document).off("click", "#searchSpan").on("click", "#searchSpan",function(){
    			alert($("#search").val());
    		});
    		$("#vcTab").die("click").live("click",function(){
	            INDEX.MAIN.openURL($(this),"versioncontrol/versioncontrollist.html","","AutoRABIT-Version Control",$("#contentLoader"));
	        });
    	},
    	
        openURL:function(objectId,filePath,functionName,docTitle,containerObject,function2){
            INDEX.MAIN.closeDialog();
            if (docTitle != ""){
                document.title = docTitle;
            }
            $("label[name=toolbaritem]").removeAttr("class");
            $(objectId).find("label[name='toolbaritem']").attr("class","active");
            $(containerObject).load(filePath, function(responseText, statusText, xhr) {
	            if(statusText == "error"){
		            alert("An error occurred: " + xhr.status + " - " + xhr.statusText);
		        } else {
		            eval(functionName);
		            if (typeof(function2) != "undefined"){
		                eval(function2);
		            }
		        }
            });
        },
    }
})(jQuery);
