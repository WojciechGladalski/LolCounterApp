document.addEventListener('DOMContentLoaded', () => {
    document.getElementById('search-bar').value = ''
    document.getElementById('search-bar').addEventListener('keyup', ev => {

        if (ev.target.value === '') {

            Array.from(document.getElementsByClassName('champion')).forEach(image => {
                    image.style.display = 'inline-block'
            })

        } else {

            Array.from(document.getElementsByClassName('champion')).forEach(title => {
                if (!title.getAttribute('name').toLowerCase().includes(ev.target.value.toLowerCase())) {
                    title.style.display = 'none'
                } else {
                    title.style.display = 'inline-block'
                }
            })

        }
    })
})