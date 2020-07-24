(async () => {
    const url = 'http://localhost:8080/restaurants';
    const response = await fetch(url);
    const restaurants = await response.join();

    const element = document.getElementById('app');
    element.innerHTML = `
        ${restaurants.map(restaurant =>`
        <p>
            ${restaurant.id}
            ${restaurant.id}
            ${restaurant.id}
        `).join('')}
        </p>
    `;
})();