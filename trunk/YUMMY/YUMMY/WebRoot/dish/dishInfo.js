$(
	function(){

		$("#upload").bind("click",function(){
			var file_path = $("#logo_file").val();
			if(file_path!="")
			$("#logo_img").attr("src",file_path);
			//alert("click");
		});
	}

);