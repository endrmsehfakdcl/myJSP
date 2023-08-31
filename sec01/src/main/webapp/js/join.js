/**
 * 
 */
function check_ok() {
	if (document.frm.jumin_1.value.length != 6) {
		alert("주민번호 6글자이어야 합니다.");
		reg_frm.jumin_1.focus();
		return false;
	}
	else if (document.frm.jumin_2.value.length != 7) {
		alert("주민번호 7글자이어야 합니다.");
		reg_frm.jumin_2.focus();
		return false;
	}
	else if (document.frm.id.value.length < 4) {
		alert("아이디는 4글자 이상이어야 합니다.");
		reg_frm.id.focus();
		return false;
	}
	//비밀번호 확인결과가 같은지 체크
	else if (document.frm.pwd.value != document.reg_frm.pwd_re.value) {
		alert("패스워드가 일치하지 않습니다.");
		reg_frm.pwd_re.focus();
		return false;
	}
	else { return true; }


}
