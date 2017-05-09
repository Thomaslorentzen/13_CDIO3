$(document).ready(function() {
	//$('#UsrAdmin').hide();
	
	$('.loginbtn').click(function(){
//		window.location = 'Brugeradministrations-side.html';
//			
//			$("#login").hide();
//			$('#UsrAdmin').show();
//			$(document).load("Brugeradministrations-side.html")
		$('#btn').remove();
		$("#login").load("Brugeradministrations-side.html");
		
	});
	
	

});