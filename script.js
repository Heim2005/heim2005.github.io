document.querySelectorAll(".tab-button").forEach(button => {
    button.addEventListener("click", () => {

        // remove active from all buttons
        document.querySelectorAll(".tab-button").forEach(btn => btn.classList.remove("active"));

        // add active to clicked button
        button.classList.add("active");

        // hide all content
        document.querySelectorAll(".tab-content").forEach(content => content.classList.remove("active"));

        // show selected
        const tab = button.getAttribute("data-tab");
        document.getElementById(tab).classList.add("active");
    });
});