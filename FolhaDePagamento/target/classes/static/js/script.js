//mostrar menu mobile
function menuShow(){
    let menuMobile = document.querySelector('.mobile-menu');
    if (menuMobile.classList.contains('open')){
        menuMobile.classList.remove('open');
    }else{
        menuMobile.classList.add('open')
    }
}
//reload
var btrld = document.querySelector(".rld")
btrld.addEventListener('click', reload)
function reload(){
    window.location.reload()
    console.log("ok")
}
//volta para index
var logo = document.querySelector(".nav-logo")
logo.addEventListener('click', foridx)
function foridx(){
    window.location.href = "/folha-de-pagamento/"
}
//funçao de aparecer as tabela
var coll = document.getElementsByClassName("collapsible");
var i;

for (i = 0; i < coll.length; i++) {
    coll[i].addEventListener("click", function () {
        this.classList.toggle("active");
        var content = this.nextElementSibling;
        if (content.style.maxHeight) {
            content.style.maxHeight = null;
        } else {
            content.style.maxHeight = content.scrollHeight + "px";
        }
    });
}