function colora(value) {
  if (value >= 0 && value <= 25) {
    document.getElementById("bar").classList.add("text-bg-danger");
    document.getElementById("bar").classList.remove("text-bg-success");
    document.getElementById("bar").classList.remove("text-bg-warning");
    document.getElementById("bar").classList.remove("text-bg-info");
  }
   else if (value > 25 && value <= 50) {
    document.getElementById("bar").classList.remove("text-bg-danger");
    document.getElementById("bar").classList.remove("text-bg-success");
    document.getElementById("bar").classList.add("text-bg-warning");
    document.getElementById("bar").classList.remove("text-bg-info");
  }
  else if (value > 50 && value <= 75) {
    document.getElementById("bar").classList.remove("text-bg-danger");
    document.getElementById("bar").classList.remove("text-bg-success");
    document.getElementById("bar").classList.remove("text-bg-warning");
    document.getElementById("bar").classList.add("text-bg-info");
  }
  else if (value > 75 && value <= 100) {
    document.getElementById("bar").classList.remove("text-bg-danger");
    document.getElementById("bar").classList.add("text-bg-success");
    document.getElementById("bar").classList.remove("text-bg-warning");
    document.getElementById("bar").classList.remove("text-bg-info");
  }
}

function startGame() {
  document.getElementById("button").innerHTML = "Check";
}