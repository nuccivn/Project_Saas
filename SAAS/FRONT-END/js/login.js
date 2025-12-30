document.getElementById('loginForm').addEventListener('submit', function(e) {
    e.preventDefault();

    const nome = document.getElementById('nome').value;
    const senha = document.getElementById('senha').value;

    console.log('Login feito com sucesso para:', nome);

    if (nome === 'admin' && senha === '2026') {
        window.location.href = 'dashboard.html';
    } else {
        alert('Nome ou senha incorretos. Tente novamente.');
    }

});