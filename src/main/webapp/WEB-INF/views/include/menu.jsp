<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<nav id="left-menu">

	<!-- Split dropright button -->
	<div class="btn-group dropright">
		<button type="button" class="btn btn-a">인사</button>
		<button type="button"
			class="btn btn-a dropdown-toggle dropdown-toggle-split"
			id="dropdownMenuLink1" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false">
			<span class="sr-only">Toggle Dropright</span>
		</button>
		<div class="dropdown-menu " aria-labelledby="dropdownMenuLink1">
			<!-- Dropdown menu links -->
			<a class="dropdown-item" href="/emp/basicData">기본사항 </a>
		</div>
	</div>

	<!-- Split dropright button -->
	<div class="btn-group dropright">
		<button type="button" class="btn btn-a">조직 </button>
		<button type="button"
			class="btn btn-a dropdown-toggle dropdown-toggle-split"
			id="dropdownMenuLink2" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false">
			<span class="sr-only">Toggle Dropright</span>
		</button>
		<div class="dropdown-menu " aria-labelledby="dropdownMenuLink2">
			<!-- Dropdown menu links -->
			<a class="dropdown-item" href="/mana/">조직관리 </a> <a
				class="dropdown-item" href="/mana/manaList">조직원확인 </a>

		</div>
	</div>
	<!-- Split dropright button -->
	<div class="btn-group dropright">
		<button type="button" class="btn btn-a">출퇴근 </button>
		<button type="button"
			class="btn btn-a dropdown-toggle dropdown-toggle-split"
			id="dropdownMenuLink3" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false">
			<span class="sr-only">Toggle Dropright</span>
		</button>
		<div class="dropdown-menu " aria-labelledby="dropdownMenuLink3">
			<!-- Dropdown menu links -->
			<a class="dropdown-item" href="/work">출퇴근 리스트 </a> <a
				class="dropdown-item" href="/work/input">출퇴근 기록 </a>
		</div>
	</div>

</nav>

