const button = document.getElementById('button')

button.addEventListener ('click', (event) => {
    event.preventDefault()

    const name = document.getElementById ('name')
    const lastname = document.getElementById ('lastname')
    const email = document.getElementById ('email')
    const mobile = document.getElementById ('mobile')
    const contry = document.getElementById ('contry')
    const gender = document.getElementById ('gender')

    if (name.value == '') {
        alert ('Error, please enter your name.')
        name.classList.add("errorInput")
    }
    if (lastname.value == '') {
        alert ('Error, please enter your last name.')
        lastname.classList.add("errorInput")
    }
    if (email.value == '') {
        alert ('Error, please enter your email.')
        email.classList.add("errorInput")
    }
    if (mobile.value == ''|| mobile.value == isNaN ) {
        alert ('Error, please enter your mobile.')
        mobile.classList.add("errorInput")
    }
    if (contry.value == '') {
        alert ('Error, please enter your contry.')
        contry.classList.add("errorInput")
    }
      
    }
    
)
