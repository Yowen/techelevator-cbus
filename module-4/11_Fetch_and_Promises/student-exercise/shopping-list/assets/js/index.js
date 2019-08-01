let itemsLoaded= false;
const loadButton = document.querySelector('.loadingButton');

loadButton.addEventListener("click", () => {
    if(!itemsLoaded) {
        loadGroceries();
    }
});

function loadGroceries() {
    fetch('assets/data/shopping-list.json')
    .then((response) => {
        return response.json();
    })
    .then((groceries) => {
        if('content' in document.createElement('template')) {
            const list = document.querySelector("ul");
            
            groceries.forEach((item) => {
                const tmpl = document.getElementById('shopping-list-item-template').content.cloneNode(true);
                tmpl.querySelector("li").insertAdjacentHTML('afterbegin', item.name);
                if( item.completed ) {
                    const circleCheck = tmpl.querySelector('.fa-check-circle');
                    circleCheck.className += " completed";
                }
                list.appendChild(tmpl);
            });
            itemsLoaded = true;
        } else {
            console.error('Your browser does not support templates');
        }
    })
    .catch((err) => {console.error(err)}); ;
}