/*
Case Sensitive = reconhece letras maisuculas e minusculas

por Tag: getElementByTagName()
por id: getElementById()
por Nome: getElementsByName()
por Classe: getElementsByClassName()
por Seletor: querySelector()

*/
let nome = document.getElementById(nm);
let email = document.querySelector('input#email')
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false



nm.style.width = '100%'
email.style.width = '100%'


/*Condições de validações*/

/*Validando Nome do Usuário*/
function validarNome(){
    let txtNome = document.querySelector('#txtNome')
    if(nm.value.length < 3 ){
        txtNome.innerHTML = 'Nome inválido amigo'
        txtNome.style.color = 'red'
    } else {
        txtNome.innerHTML = 'Nome válido amigo'
        txtNome.style.color = 'green'
        nomeOk = true
    }
}

/*Validando E-Mail do Usuário|Cliente*/
function validarEmail(){
      let txtEmail = document.querySelector('#txtEmail')
      if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 ){
          txtEmail.innerHTML = 'E-Mail Inválido irmão'
          txtEmail.style.color = 'red'
      } else {
          txtEmail.innerHTML = 'E-Mail Válido irmão'
          txtEmail.style.color = 'green'
          emailOk = true
      }
}

function validarAssunto() {
    let txtAssunto = document.querySelector('#txtAssunto')

    if(assunto.value.length >= 100){
        txtAssunto.innerHTML = 'A Mensagem do Assunto deve ter no máximo 100 Caracteres'
        txtAssunto.style.color = 'red'
        txtAssunto.style.display = 'block'
    } else {
        txtAssunto.style.display = 'none'
        assuntoOk = true
    }
    
}

function enviar(){
    if(nomeOk == true && emailOk == true && assuntoOk == true){
        alert("Formulário enviado com sucesso ♥")
    } else {
        alert("Preencha o Formulário Corretamente antes de enviar")
    }
}