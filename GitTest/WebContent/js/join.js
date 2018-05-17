$(document).ready(function(){
	var id='';
    $('#sel').on('change', function () {
        $('#domain').val($(':selected').text());
        $('#domain').attr("disabled","disabled");
    });
    
    $('input[type=reset]').on('click', function() {
		location.href='main.net';
	});
    
    $('#idcheck').on('click', function(){
    	var data = $('#id').serialize();
    	id=$('#id').val();
    	$.ajax({
			type : "GET",
			data : data,
			url: "idcheck.net",
			success : function (msg) {
				if(msg==1){
					$('#checkId').text('ID 중복');
					$('#checkId').attr('style', 'color:red');
				}else{
					$('#checkId').text('ID 사용가능');
					$('#checkId').attr('style', 'color:green');
				}
			}
		
		});
    	
    });
    
    $('form').submit(function () {
    	if($('#id').val()!=id){
        	alert('ID 중복 체크하세요');
        	$('#id').focus();
        	return false;
        }
        if($('#id').val()==''){
            alert("ID를 입력해");
            $('#id').focus();
            return false;
        }
        if($('#pass').val()==''){
            alert("비밀번호 입력해");
            $('#pass').focus();
            return false;
        }
        if($('#age').val()==''){
            alert("나이를 입력해");
            $('#age').focus();
            return false;
        }
        if(isNaN($('#age').val())){
            alert("나이는 숫자");
            $('#age').focus();
            $('#age').val('');
            return false;
        }
        if($('#email').val()==''){
            alert("이메일을 입력햐");
            $('#email').focus();
            return false;
        }
        if($('#domain').val()==''||$("#domain").val()=="직접입력"){
            alert("도메인을 입력해");
            $('#domain').focus();
            return false;
        }
        if($('input[type=radio]:checked').length<1){
            alert("성별선택 안하냐");
            return false;
        }
        
    });

});