/**
 * 
 */
function loginCheck() {
	return true;
}

function joinCheck() {
	if (document.frm.userid.value.length < 4) {
		alert("아이디는 4글자 이상이어야 합니다.");
		frm.userid.focus();
		return false;
	}
	if (document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("비밀번호가 일치하지 않습니다.");
		frm.pwd.focus();
		return false;
	}

	if (document.frm.reid.value.length == 0) {
		alert("아이디 중복 체크를 해주세요");
		frm.userid.focus();
		return false;
	}

	return true;
}

function idCheck() {
	if (document.frm.userid.value.length == 0) {
		alert("아이디를 넣어주세요.");
		frm.userid.focus();
		return false;
	}

	let url = 'idCheck.do?userid=' + document.frm.userid.value;
	window.open(
		url,
		"_blank",
		"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}

function idok() {
	opener.frm.userid.value = document.frm.userid.value;
	opener.frm.reid.value = document.frm.userid.value;
	self.close();
}

