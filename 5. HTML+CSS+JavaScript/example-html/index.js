

const VALID_EMAIL = 'hong@example.com';
const VALID_PASSWORD = 'qwer1234';

function btnclick() {
    const email = document.getElementsByName('email').value;
    const password = document.getElementsByName('password').value;
    // 자격증명 검증
    if (email === VALID_EMAIL && password === VALID_PASSWORD) {
        location.href = 'user-list.html';
    } else {
        alert('이메일 또는 비밀번호가 올바르지 않습니다.');
    }
}

