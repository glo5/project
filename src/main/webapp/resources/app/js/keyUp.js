function addHyphen(value){
	let str = $.trim($(value).val()).replace(/[^0-9]/g,'');
	let tmp = "";
	
	if(str.length <4){
		return str;
	}else if(str.length < 7){
		tmp += str.substr(0,3);
		tmp += "-";
		tmp += str.substr(3);
		return tmp;
	}else if(str.length < 11){
		tmp += str.substr(0,3);
		tmp += '-';
		tmp += str.substr(3,3);
		tmp += '-';
		tmp += str.substr(6);
		return tmp;
	}else{              
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3, 4);
        tmp += '-';
        tmp += str.substr(7);
        
        return tmp;
    }

    return str;
}
function addColon(value){
	let str = $.trim($(value).val()).replace(/[^0-9]/g,'');
	let tmp = "";
	
	if(str.length <5){
		tmp += str.substr(0,2);
		tmp +=":";
		tmp += str.substr(2);
		return tmp;
	}
	
    return str;
}
	
$("#officePhone").keyup(function(){
		if($(this).val().length ==13 ){
				$(this).prop("readonly","true");
			
		}
		$(this).val( addHyphen(this));
});
$("#phone").keyup(function(){
	if($(this).val().length ==13 ){
		$(this).prop("readonly","true");
	}
	$(this).val( addHyphen(this));
});

$("#startTime").keyup(function(){
	if($(this).val().length ==5 ){
		$(this).prop("readonly","true");
	}
	$(this).val( addColon(this));
});
$("#endTime").keyup(function(){
	if($(this).val().length ==5 ){
		$(this).prop("readonly","true");
	}
	$(this).val( addColon(this));
});
$("#addTime").keyup(function(){
	if($(this).val().length ==5 ){
		$(this).prop("readonly","true");
	}
	$(this).val( addColon(this));
});

$("#email").keyup(function(){
	$(this).val($.trim($(this).val()).replace(/[^0-9a-zA-Z]/g,''));
});

