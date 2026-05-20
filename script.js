
//tabs
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

//coin game
document.getElementById("startUnityBtn").addEventListener("click", () => {

    // Swap screens
    document.getElementById("unity-start-screen").style.display = "none";
    document.getElementById("unity-container").style.display = "block";

    // Load Unity dynamically
    const loaderScript = document.createElement("script");
    loaderScript.src = "CoinDrop/Build/CoinDrop.loader.js"; // your real Unity loader file here
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

document.getElementById("startUnityBtn2").addEventListener("click", () => {

    // Swap screens
    document.getElementById("unity-start-screen2").style.display = "none";
    document.getElementById("unity-container2").style.display = "block";

    // Load Unity dynamically
    const loaderScript = document.createElement("script");
    loaderScript.src = "Build/UnityLoader.js"; // your real Unity loader file here
    document.body.appendChild(loaderScript);

    loaderScript.onload = () => {
        createUnityInstance(
            document.getElementById("unity-container2"),
            {
                dataUrl: "Build/build.data",
                frameworkUrl: "Build/build.framework.js",
                codeUrl: "Build/build.wasm",
            }
        );
    };
});



(function() {
    const button = document.getElementById('pianoPress');
    const video = document.getElementById('pianoVid');
    // const status = document.getElementById('status');
    let holdTimer = null;
    const holdDuration = 500; // milliseconds to trigger hold

    // Function to run when hold is detected
    function onHold() {
        // status.textContent = "Hold detected!";
        video.muted = false;
    }

    // Start timer on press
    function startHoldTimer() {
        // Prevent multiple timers
        if (holdTimer) return;
        holdTimer = setTimeout(onHold, holdDuration);
        // status.textContent = "Holding...";
    }

    // Cancel timer on release
    function cancelHoldTimer() {
        if (holdTimer) {
            clearTimeout(holdTimer);
            holdTimer = null;
        }
        // status.textContent = "Released.";
        video.muted = true;
    }

    // Mouse events
    button.addEventListener('mousedown', startHoldTimer);
    button.addEventListener('mouseup', cancelHoldTimer);
    button.addEventListener('mouseleave', cancelHoldTimer);

    // Touch events (mobile)
    button.addEventListener('touchstart', startHoldTimer);
    button.addEventListener('touchend', cancelHoldTimer);
    button.addEventListener('touchcancel', cancelHoldTimer);
})();