// add pageTitle
const name = 'My Shopping List';
// add groceries
const groceries = [ 'Apple', 'Orange', 'Lemon', 'Avocado', 'Bread', 'Milk', 'Sugar', 'Salt', 'Corn', 'Onion' ];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('title');
  pageTitle.innerText = name;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  // const body = document.querySelector('.shopping-list');
  // const shoppingList = document.querySelector('.shopping-list ul');
  // for (let n = 0; n < items.length; n++) {
  //   const item = document.createElement('li');
  //   item.innerText = items[n];
  //   shoppingList.appendChild(item);
  // }
  // return body.appendChild(groceries);
  const ul = document.querySelector('.shopping-list ul');
  groceries.forEach( (item) => {
    const li = document.createElement('li');
    li.innerText = item;
    ul.appendChild(li);
  });
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const ul = document.querySelectorAll('li');
  ul.forEach( (li) => {
    li.setAttribute('class', 'completed');
  });
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
