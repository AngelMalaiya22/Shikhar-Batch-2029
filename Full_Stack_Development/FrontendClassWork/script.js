const moodBtn= document.getElementById("moodBtn");

moodBtn.addEventListener("click", () => { 
    console.log("Button clicked!");
});

const moods = [
    { color: "#FFE5B4", text: "Feeling Peachy "}, 
    { color: "#B4E1FF", text:"Feeling Cool & Calm "},
    { color: "#D8B4FF", text:"Feeling Mysterious"},
    { color: "#B4FFC1", text: "Feeling Fired Up"}
];

const moodText = document.getElementById("moodText");

moodBtn.addEventListener("click", () => {
    const randomIndex = Math.floor(Math.random()*moods.length);
    const chosenMood = moods[randomIndex];

    document.body.style.backgroundColor = chosenMood.color;
    moodText.textContent = chosenMood.text;
});
