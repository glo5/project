$(".main-item").hover(function(){
	$(this).children(".sub-menu").stop().slideDown();
	console.log("안녕하ㅔ요")
},function(){
	$(this).children(".sub-menu").stop().slideUp();
});
$(".sub-item").hover(function(){
	$(this).children(".last-menu").stop().slideDown();
},function(){
	$(this).children(".last-menu").stop().slideUp();

});

$(".up").click(function(){
	console.log($(this).next());

	$(this).next().next().toggleClass("menu-1");
	$(this).next().next().toggleClass("active");
	
	if($(this).next().next().hasClass("active")){
		$(this).val("-");
	}else{
		$(this).val("+");
	}
});


