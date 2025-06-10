<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>BOYNEXTDOOR | Linktree Rumah</title>

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" />

  <style>
    body {
      background: radial-gradient(circle at top, #1b0033, #0e0e0e);
      font-family: 'Segoe UI', sans-serif;
      color: #eaeaea;
      overflow-x: hidden;
    }

    /* Starry background */
    body::after {
      content: "";
      position: fixed;
      top: 0; left: 0;
      width: 100%; height: 100%;
      background: url('https://www.transparenttextures.com/patterns/stardust.png') repeat;
      opacity: 0.08;
      animation: scrollBackground 60s linear infinite;
      z-index: -1;
    }

    @keyframes scrollBackground {
      0% { background-position: 0 0; }
      100% { background-position: 0 1000px; }
    }

    .container {
      max-width: 480px;
      margin: auto;
      padding: 3rem 1rem;
    }

    .profile-img {
      width: 100px;
      height: 100px;
      border-radius: 50%;
      object-fit: cover;
      margin-bottom: 1rem;
      box-shadow: 0 4px 12px rgba(128, 0, 255, 0.4);
      transition: transform 0.3s ease;
    }

    .profile-img:hover {
      transform: scale(1.05);
    }

    /* Custom Rumah-Pintu-Kunci Buttons */
    .btn-custom {
      display: flex;
      align-items: center;
      justify-content: center;
      gap: 0.5rem;
      padding: 1rem;
      font-weight: 600;
      color: #fff;
      text-decoration: none;
      transition: all 0.3s ease;
      font-size: 1rem;
      box-shadow: 0 4px 12px rgba(143, 58, 255, 0.3);
      position: relative;
      overflow: hidden;
      border: none;
    }

    .btn-custom::before {
      content: attr(data-icon);
      font-size: 1.2rem;
      margin-right: 0.5rem;
    }

    .btn-custom:hover {
      transform: scale(1.05);
      box-shadow: 0 0 15px 5px rgba(192, 132, 255, 0.5);
    }

    .btn-custom.home {
      background: linear-gradient(135deg, #6a0dad, #8f3aff);
      clip-path: polygon(50% 0%, 0% 40%, 0% 100%, 100% 100%, 100% 40%);
    }

    .btn-custom.door {
      background: linear-gradient(135deg, #3a0f6d, #6f3acc);
      clip-path: inset(0% round 12px);
    }

    .btn-custom.key {
      background: linear-gradient(135deg, #2c006d, #985fff);
      border-radius: 50% 10% 50% 10%;
    }

    .btn-custom.community {
      background: linear-gradient(135deg, #502980, #c084ff);
      border-radius: 20px;
    }

    .btn-custom.calendar {
      background: linear-gradient(135deg, #4b0082, #b066ff);
      clip-path: polygon(0 20%, 100% 20%, 100% 100%, 0 100%, 0 20%, 10% 0, 90% 0, 100% 20%);
    }

    .social-icons a {
      color: #c084ff;
      transition: transform 0.3s ease, color 0.3s ease;
    }

    .social-icons a:hover {
      color: #ffffff;
      transform: scale(1.2);
    }

    h5, p, #countdown {
      color: #c8a2ff;
    }

    #countdown {
      font-size: 1.1rem;
      animation: pulse 2s infinite;
      text-shadow: 0 0 8px #c084ff;
    }

    .ep-info:hover, #countdown:hover {
      transform: scale(1.05);
      text-shadow: 0 0 12px #8f3aff;
      transition: 0.3s ease;
    }

    .slogan {
      font-style: italic;
      font-size: 0.9rem;
      color: #aaa;
      margin-top: -10px;
    }

    .carousel-inner img {
      border-radius: 0;
    }

    @keyframes pulse {
      0% { opacity: 1; }
      50% { opacity: 0.7; }
      100% { opacity: 1; }
    }

    /* Animations */
@keyframes bounceHouse {
  0%, 100% { transform: translateY(0); }
  50% { transform: translateY(-4px); }
}

@keyframes swingDoor {
  0% { transform: rotate(0deg); }
  25% { transform: rotate(5deg); }
  50% { transform: rotate(-5deg); }
  75% { transform: rotate(3deg); }
  100% { transform: rotate(0deg); }
}

@keyframes spinKey {
  0% { transform: rotate(0deg); }
  100% { transform: rotate(360deg); }
}

/* Apply on hover */
.btn-custom.home:hover {
  animation: bounceHouse 0.6s ease;
}

.btn-custom.door:hover {
  animation: swingDoor 0.6s ease;
  transform-origin: left center;
}

.btn-custom.key:hover {
  animation: spinKey 1s linear;
}

  </style>
</head>
<body>
  <div class="container text-center">
    <!-- Profile -->
    <img src="bndd.jpg" class="profile-img" alt="Profile Image" />
    <h5 class="fw-semibold">@boynextdoor_KOZ</h5>
    <p class="ep-info"><strong>BOYNEXTDOOR 4th EP ‘No Genre’</strong></p>
    <p id="countdown" class="small">Countdown loading...</p>
    <p class="slogan">"Knock knock, who's there? The BOYNEXTDOOR."</p>

    <!-- Social Icons -->
    <div class="d-flex justify-content-center gap-3 mb-3 social-icons">
      <a href="https://www.instagram.com/boynextdoor_official" target="_blank" class="fs-4">
        <i class="fab fa-instagram"></i>
      </a>
      <a href="https://www.tiktok.com/@boynextdoor_official" target="_blank" class="fs-4">
        <i class="fab fa-tiktok"></i>
      </a>
      <a href="https://twitter.com/boynextdoor_KOZ" target="_blank" class="fs-4">
        <i class="fab fa-x-twitter"></i>
      </a>
      <a href="https://open.spotify.com/artist/BOYNEXTDOOR" target="_blank" class="fs-4">
        <i class="fab fa-spotify"></i>
      </a>
      <a href="https://www.youtube.com/@boynextdoor_official" target="_blank" class="fs-4">
        <i class="fab fa-youtube"></i>
      </a>
    </div>

    <!-- Carousel -->
    <div id="promoCarousel" class="carousel slide carousel-fade mb-4 mt-4" data-bs-ride="carousel" data-bs-interval="2000">
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="bnd1.jpeg" class="d-block w-100" alt="Promo 1">
        </div>
        <div class="carousel-item">
          <img src="bnd2.jpeg" class="d-block w-100" alt="Promo 2">
        </div>
        <div class="carousel-item">
          <img src="bnd3.jpeg" class="d-block w-100" alt="Promo 3">
        </div>
        <div class="carousel-item">
          <img src="bnd4.jpeg" class="d-block w-100" alt="Promo 4">
        </div>
        <div class="carousel-item">
          <img src="bnd5.jpeg" class="d-block w-100" alt="Promo 5">
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#promoCarousel" data-bs-slide="prev">
        <span class="carousel-control-prev-icon"></span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#promoCarousel" data-bs-slide="next">
        <span class="carousel-control-next-icon"></span>
      </button>
    </div>

    <!-- Link Buttons (Rumah - Pintu - Kunci) -->
    <div class="d-grid gap-3 mt-4">
      <a href="https://kprofiles.com/boynextdoor-members-profile/" class="btn-custom home" data-icon="🏠" target="_blank">Members Profile</a>
      <a href="https://shop.weverse.io/en/shop/USD/artists/112/categories/1975?subCategoryId=5553" class="btn-custom door" data-icon="🚪" target="_blank">Pre-Order Album</a>
      <a href="https://bnd.lnk.to/No_Genre" class="btn-custom key" data-icon="🔑" target="_blank">Pre-Save & Pre-Add</a>
      <a href="https://weverse.io/BOYNEXTDOOR" class="btn-custom community" data-icon="👥" target="_blank">Weverse</a>
      <a href="https://calendar.google.com/calendar/render?action=TEMPLATE&text=BOYNEXTDOOR+No+Genre+Release&dates=20250513T090000Z/20250513T100000Z&details=Comeback+release+on+all+platforms!&sf=true" class="btn-custom calendar" data-icon="📅" target="_blank">Add to Calendar</a>
    </div>
  </div>

  <!-- Bootstrap Bundle JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

  <!-- Countdown -->
  <script>
    const countdownElement = document.getElementById("countdown");
    const releaseDate = new Date("2025-05-13T18:00:00+09:00");

    function updateCountdown() {
      const now = new Date();
      const diff = releaseDate - now;

      if (diff <= 0) {
        countdownElement.innerHTML = "<strong>Out now!</strong>";
        return;
      }

      const days = Math.floor(diff / (1000 * 60 * 60 * 24));
      const hours = Math.floor((diff / (1000 * 60 * 60)) % 24);
      const minutes = Math.floor((diff / (1000 * 60)) % 60);
      const seconds = Math.floor((diff / 1000) % 60);

      countdownElement.innerHTML = `Drops in: <strong>${days}d ${hours}h ${minutes}m ${seconds}s</strong>`;
    }

    updateCountdown();
    setInterval(updateCountdown, 1000);
  </script>
</body>
</html>