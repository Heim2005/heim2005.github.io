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


document.getElementById("startUnityBtn").addEventListener("click", () => {

    // Swap screens
    document.getElementById("unity-start-screen").style.display = "none";
    document.getElementById("unity-container").style.display = "block";

    // Load Unity dynamically
    const loaderScript = document.createElement("script");
    loaderScript.src = "Build/UnityLoader.js"; // your real Unity loader file here
    document.body.appendChild(loaderScript);

    loaderScript.onload = () => {
        createUnityInstance(
            document.getElementById("unity-container"),
            {
                dataUrl: "Build/build.data",
                frameworkUrl: "Build/build.framework.js",
                codeUrl: "Build/build.wasm",
            }
        );
    };
});
