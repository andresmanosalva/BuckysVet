document.addEventListener("DOMContentLoaded", function () {
    const images = [
        "../images/imagesIndex/Presentacion1.jpg",
        "../images/imagesIndex/Presentacion2.png",
        "../images/imagesIndex/Presentacion3.jpg",
        "../images/imagesIndex/Presentacion4.png",
        "../images/imagesIndex/Presentacion5.png",
        "../images/imagesIndex/Presentacion6.jpg",
        "../images/imagesIndex/Presentacion7.jpg",
        "../images/imagesIndex/Presentacion8.jpg",
        "../images/imagesIndex/Presentacion9.jpg",
        "../images/imagesIndex/Presentacion10.jpg"
    ];

    let currentIndex = 0;
    const heroImage = document.querySelector(".hero > img");
    const leftArrow = document.querySelector(".hero-arrow-left");
    const rightArrow = document.querySelector(".hero-arrow-right");

    if (!heroImage || !leftArrow || !rightArrow) {
        console.error("Uno o más elementos no fueron encontrados en el DOM.");
        return;
    }

    function changeImage(index) {
        currentIndex = (index + images.length) % images.length;
        heroImage.src = images[currentIndex];
    }

    // Manejo de error en carga de imágenes
    heroImage.addEventListener("error", () => {
       console.error(`Error al cargar la imagen: ${heroImage.src}`);
    });

    // Iniciar cambio automático de imágenes
    let interval = setInterval(() => changeImage(currentIndex + 1), 3000);

    function resetInterval() {
        clearInterval(interval);
        interval = setInterval(() => changeImage(currentIndex + 1), 3000);
    }

    // Event Listeners para las flechas de navegación
    leftArrow.addEventListener("click", () => {
        changeImage(currentIndex - 1);
        resetInterval();
    });

    rightArrow.addEventListener("click", () => {
        changeImage(currentIndex + 1);
        resetInterval();
    });
});
