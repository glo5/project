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


$(".selectBtn").click(function(){
	
	if($.trim($("#requestId").val()) == ""){
		alert("사원번호는 필수입니다!!");
		return false;
	}
	if($.trim($("#requestGroup").val()) == ""){
		$("#requestGroup").val(" "); 
	}
	let form = {
			id: $("#requestId").val(),
			department:$("#requestGroup").val()		
	}
	
	$.ajax({
		url:"/emp/basicData/select",
		type:"GET",
		data: form,
		success: function(data){
			console.log(data);
			 $("#id").val(data.id);
			 $("#department").val(data.department);
			 $("#number").val(data.number);
			 $("#gender").val(data.gender);
			 $("#blodType").val(data.blodType);
			 
			 $("#staff").val(data.staff);
			 $("#name").val(data.name);
			 $("#officePhone").val(data.officePhone);
			 $("#phone").val(data.phone);
			 $("#email").val(data.email);
			 $("#jobType").val(data.jobType);
			 $("#startDate").val(data.startDate);
			 $("#longDate").val(data.longDate);
			 $("#lastDate").val(data.lastDate);
				
		},
		error: function(){
			alert("err")
		}
		
	
	})
})

$(".newBtn").click(function(){
	let a = /^[0-9]*$/;
	let number =$.trim($("#number").val()).replace(/[^0-9]/g,'');
	
	if($.trim($("#name").val()) == ""){
		alert("이름이 공백입니다.");
		$("#name").focus();
		return false;
	}
	if(!a.test(number)){
		alert("주민번호는 숫자만 입력해야합니다.");
		$("#number").focus();
		return false;
	}
	
	if(number.length != 13){
		alert("주민등록번호는 13자여야 합니다.");
		$("#number").focus();
		return false;
	}
	if($.trim($("#department").val()) == ""){
		alert("부서가 공백입니다.");
		$("#department").focus();
		return false;
	}
	if($.trim($("#staff").val()) == ""){
		alert("직위가 공백입니다.");
		$("#staff").focus();
		return false;
	}
	if($.trim($("#phone").val()).length > 13 || $.trim($("#phone").val()) == ""){
		alert("휴대폰번호가 13자여야합니다.");
		$("#phone").focus();
		return false;
	}
	if($.trim($("#officPhone").val()).length > 13 || $.trim($("#officePhone").val()) == ""){
		alert("사내전화번호가 13자여야 합니다.");
		$("#officePhone").focus();
		return false;
	}
	if($.trim($("#jobType").val()) == ""){
		alert("채용구분이 공백입니다.");
		$("#jobType").focus();
		return false;
	}
	
	if($("#startDate").val() == ""){
		alert("입사일이 공백입니다.");
		$("#startDate").focus();
		return false;
	}
	if($("#lastDate").val() == ""){
		alert("퇴사일이 공백입니다.");
		$("#lastDate").focus();
		return false;
	}
		


	$.ajax({
		url:"/emp/basicData/insert",
		type:"GET",
		data: $("#frm").serialize(),
		success: function(data){
			$("#frm")[0].reset();
			console.log(data);
			$("#id").val(data);
			alert("회원이 추가 되었습니다.");
			
		},
		error: function(){
			alert("err")
		}
		
	
	})
})

$(".updateBtn").click(function(){
	let a = /^[0-9]*$/;
	let number =$.trim($("#number").val()).replace(/[^0-9]/g,'');
	
	if($.trim($("#name").val()) == ""){
		alert("이름이 공백입니다.");
		$("#name").focus();
		return false;
	}
	if(!a.test(number)){
		alert("주민번호는 숫자만 입력해야합니다.");
		$("#number").focus();
		return false;
	}
	
	if(number.length != 13){
		alert("주민등록번호는 13자여야 합니다.");
		$("#number").focus();
		return false;
	}
	if($.trim($("#department").val()) == ""){
		alert("부서가 공백입니다.");
		$("#department").focus();
		return false;
	}
	if($.trim($("#staff").val()) == ""){
		alert("직위가 공백입니다.");
		$("#staff").focus();
		return false;
	}
	if($.trim($("#phone").val()).length > 13 || $.trim($("#phone").val()) == ""){
		alert("휴대폰번호가 13자여야합니다.");
		$("#phone").focus();
		return false;
	}
	if($.trim($("#officPhone").val()).length > 13 || $.trim($("#officePhone").val()) == ""){
		alert("사내전화번호가 13자여야 합니다.");
		$("#officePhone").focus();
		return false;
	}
	if($.trim($("#jobType").val()) == ""){
		alert("채용구분이 공백입니다.");
		$("#jobType").focus();
		return false;
	}
	
	if($("#startDate").val() == ""){
		alert("입사일이 공백입니다.");
		$("#startDate").focus();
		return false;
	}
	if($("#lastDate").val() == ""){
		alert("퇴사일이 공백입니다.");
		$("#lastDate").focus();
		return false;
	}
		

	
	$.ajax({
		url:"/emp/basicData/update",
		type:"GET",
		data: $("#frm").serialize(),
		success: function(data){
			if(data == "insert"){
				alert("존재하지않는 회원이라 추가됩니다.");
			}else{
				alert("변경되었습니다.")
			}
			
		},
		error: function(){
			alert("err")
		}
	})
})

$(".deleteBtn").click(function(){
	if($.trim($("#requestId").val()) == ""){
		alert("사원번호는 필수입니다!!");
		return false;
	}
	if($.trim($("#requestGroup").val()) == ""){
		$("#requestGroup").val(" "); 
	}
	
	let form = {
			id: $("#requestId").val(),
			department:$("#requestGroup").val()		
	}
	$.ajax({
		url:"/emp/basicData/delete",
		type:"GET",
		data: form,
		success: function(data){
			if(data == "null"){
				alert("사원이 존재하지 않습니다!")
				return true;
			}
			alert("삭제되었습니다.");
		},
		error: function(){
			alert("err")
		}
	})
})

$(".ManadeleteBtn").click(function(){

	
	
	let form = {
			id: $("#requestId").val(),
			department:$("#requestGroup").val()		
	}
	$.ajax({
		url:"/mana/manaData/delete",
		type:"GET",
		data: form,
		success: function(data){
			if(data == "null"){
				alert("사원이 존재하지 않습니다!")
				return true;
			}
			alert("삭제되었습니다.");
		},
		error: function(){
			alert("err")
		}
	})
})

$(".manaBtn").click(function(){
	
	
	
	$.ajax({
		url:"/mana/select",
		type:"GET",
		data: "",
		success: function(data){
			console.log(data);
			 var str = "<table id='manaList'>\n <tr>\n"+
			 			"<th>no</th>\n"+
						"<th>조직명</th>\n"+
						"<th>조직코드</th>\n"+
						"<th>상위조직</th>\n"+
						"<th>시작일</th>\n"+
						"<th>종료일자</th>\n"+
						"<th>조직유형</th>\n"+
						"<th>조직순서</th>\n"+
					"</tr>" ;
			 		
			    $.each(data,function(i,v){
			        //데이터 인풋
			    
			    	str+="<tr >";
			    	str +="<td>"+ (i+1)+"</td>";
			        str += "<td><pre>"+ v.groupName+"</pre></td>";
			        str +="<td>"+ v.groupId+"</td>";
			        str +="<td>"+ v.groupSq+"</td>";
			        str +="<td>"+ v.startDate+"</td>";
			        str +="<td>"+ v.endDate+"</td>";
			        str +="<td>"+ v.groupType+"</td>";
			        str +="<td>"+ v.groupCount+"</td>";
			        str +="</tr>";
			        
			    });
			 str +="</table>";
			 $(".content").html(str);
			 
			
		},
		error: function(){
			alert("err")
		}
		
	
	})
})

$("#workBtn").click(function(){
	
	if($.trim($("#id").val()) == ""){
		alert("사원번호는 필수입니다!!");
		$("#id").focus();
		return false;
	}
	
	if($.trim($("#name").val()) == ""){
		alert("이름은 필수입니다!");
		$("#name").focus();
		return false;
	}
	if($("#date").val() == ""){
		alert("출근일 공백입니다.");
		$("#startDate").focus();
		return false;
	}
	
	if($.trim($("#startTime").val()) == ""){
		alert("시작시간이 공백입니다.");
		$("#startTime").focus();
		return false;
	}
	if($.trim($("#endTime").val()) == ""){
		alert("끝나는 시간이 공백입니다.");
		$("#lastTime").focus();
		return false;
	}
	if($.trim($("#addTime").val())==""){
		$("#addTime").val("");
	}
	
	$.ajax({
		url:"/work/insert",
		type:"GET",
		data: $("#frm").serialize(),
		success: function(data){
			alert("결과가 반영되었습니다.");
			
		},
		error: function(){
			alert("err")
		}
	})
})

$(".workSelectList").click(function(){
	
	if($.trim($("#reqStartDate").val()) == ""){
		alert("시작 날짜는 필수입니다!!");
		$("#reqStartDate").focus();
		return false;
	}
	if($.trim($("#reqEndDate").val()) == ""){
		let today = new Date();
		let year = today.getFullYear();
		let month = today.getMonth()+1;
		let date = today.getDate();
		
		if(month<10) {
			month='0'+month;
		} 

		if(date<10) {
			date='0'+date;
		} 
		
		$("#reqEndDate").val(year +"-"+month+"-"+date);
		
	}
	
	if($.trim($("#reqDept").val()) == ""){
		$("#reqDept").val("");
	}
	
	if($.trim($("#reqStaff").val())==""){
		$("#reqStaff").val("")
	}
	let form = {
			reqStartDate: $("#reqStartDate").val(),
			reqEndDate:$("#reqEndDate").val(),
			reqDept:$("#reqDept").val(),
			reqStaff:$("#reqStaff").val(),
			
	}
	console.log(form);
	$.ajax({
		url:"/work/select",
		type:"GET",
		data: form,
		success: function(data){
			console.log(data);
			 var str = "<tr>\n"+
			 			"<th>no</th>\n"+
						"<th>사원번호</th>\n"+
						"<th>성명</th>\n"+
						"<th>소속</th>\n"+
						"<th>직위</th>\n"+
						"<th>출근일자</th>\n"+
						"<th>요일</th>\n"+
						"<th>시작시간</th>\n"+
						"<th>종료시간</th>\n"+
						"<th>연장근무시간</th>\n"+
						"<th>근무특이사항</th>\n"+
					"</tr>" 
			 		
			    $.each(data,function(i,v){
			        //데이터 인풋
			    	str+="<tr >";
			    	str +="<td>"+ (i+1)+"</td>";
			        str +="<td>"+ v.id+"</td>";
			        str +="<td>"+ v.name+"</td>";
			        str +="<td>"+ v.department+"</td>";
			        str +="<td>"+ v.staff+"</td>";
			        str +="<td>"+ v.date+"</td>";
			        str +="<td>"+ v.day+"</td>";
			        str +="<td>"+ v.startTime+"</td>";
			        str +="<td>"+ v.endTime+"</td>";
			        str +="<td>"+ v.addTime+"</td>";
			        str +="<td>"+ v.workCode+"</td>";
			        str +="</tr>";
			    });
			    
			    $("#workList").html(str);
			
			
		},
		error: function(){
			alert("err")
		}
	})
})

