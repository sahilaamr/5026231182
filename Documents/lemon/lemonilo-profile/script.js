document.getElementById("contactForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = document.getElementById("name");
  const email = document.getElementById("email");
  const message = document.getElementById("message");

  if (name.value && email.value && message.value) {
    document.getElementById("successMessage").classList.remove("hidden");
    name.value = "";
    email.value = "";
    message.value = "";
  }
});
