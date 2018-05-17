$(document).ready(function(){
	$("#viewcount").change(function(){
		var limit=$('#viewcount option:selected').val();
		$.ajax({
			type : "POST",
			data : {"limit" : limit, "state" : "ajax"},
			url : "./BoardList.bo?",
			cache : false,
			headers : {"cache-control" : "no-cache", "pragma" : "no-chache"},
			success: function(data){
				$("table:first").empty().prepend(data);
			},
			error: function() {
				alert("error");
			}
		});
		
	});
});