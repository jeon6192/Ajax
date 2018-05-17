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
					$('#checkId').text('ID �ߺ�');
					$('#checkId').attr('style', 'color:red');
				}else{
					$('#checkId').text('ID ��밡��');
					$('#checkId').attr('style', 'color:green');
				}
			}
		
		});
    	
    });
    
    $('form').submit(function () {
    	if($('#id').val()!=id){
        	alert('ID �ߺ� üũ�ϼ���');
        	$('#id').focus();
        	return false;
        }
        if($('#id').val()==''){
            alert("ID�� �Է���");
            $('#id').focus();
            return false;
        }
        if($('#pass').val()==''){
            alert("��й�ȣ �Է���");
            $('#pass').focus();
            return false;
        }
        if($('#age').val()==''){
            alert("���̸� �Է���");
            $('#age').focus();
            return false;
        }
        if(isNaN($('#age').val())){
            alert("���̴� ����");
            $('#age').focus();
            $('#age').val('');
            return false;
        }
        if($('#email').val()==''){
            alert("�̸����� �Է���");
            $('#email').focus();
            return false;
        }
        if($('#domain').val()==''||$("#domain").val()=="�����Է�"){
            alert("�������� �Է���");
            $('#domain').focus();
            return false;
        }
        if($('input[type=radio]:checked').length<1){
            alert("�������� ���ϳ�");
            return false;
        }
        
    });

});