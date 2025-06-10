<!DOCTYPE html>
<html lang="en">

<head>
    <title>Sahilah Amru : 5026231182</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
        integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <style>
        .jumbotron {
            background-color:rgb(246, 226, 231);
            height: 100px;
            margin-bottom: 0;
            border-radius: 0;
        }

        body {
            background-image: url('{{ asset("assets/img/pink.jpg") }}'); /* Ganti bg.jpg dengan nama file gambar Anda */
            background-size: cover; /* Membuat gambar menutupi seluruh area */
            background-repeat: no-repeat; /* Mencegah gambar berulang */
            background-attachment: fixed; /* Membuat gambar tetap di tempat saat discroll */
            background-position: center center; /* Memposisikan gambar di tengah */
        }

        .container {
            background-color: rgba(255, 255, 255, 0.7); /* Putih semi-transparan */
            padding: 20px;
            border-radius: 15px; /* Sudut lebih membulat */
            margin-top: 20px;
            margin-bottom: 50px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Opsional: sedikit bayangan */
        }

        .form-inline .form-control {
            border-radius: 10px; /* Sudut membulat untuk input */
            border-color:rgb(255, 255, 255); /* Warna border sesuai skema warna */
        }
        .form-inline .btn-info {
            background-color:rgb(246, 226, 231); /* Warna tombol sesuai skema */
            border-color: rgb(246, 226, 231);
            color: rgb(250, 250, 250); /* Warna teks tombol */
            border-radius: 10px;
        }

        .pagination {
        margin-top: 20px; /* Memberi jarak di atas pagination dari tabel/konten */
        justify-content: center; /* Menengahkan pagination secara horizontal */
        }

        .page-item .page-link {
        color: #CD5C5C; /* Indian Red - Warna teks link (nomor halaman, panah) */
        border: 1px solid rgb(233, 207, 211); /* Pink Muda - Border di sekitar item */
        border-radius: 8px; /* Sudut membulat */
        margin: 0 4px; /* Jarak antar item pagination */
        background-color: rgba(255, 255, 255, 0.9); /* Latar belakang putih semi-transparan */
    }

    .page-item.active .page-link {
        background-color: rgb(246, 226, 231); /* Hot Pink - Warna latar belakang untuk halaman aktif */
        border-color: rgb(246, 226, 231); /* Border warna yang sama dengan background */
        color: white !important; /* Warna teks putih untuk halaman aktif */
    }

    .page-item.disabled .page-link {
        color: #ccc; /* Warna teks abu-abu untuk link yang dinonaktifkan */
        pointer-events: none; /* Mencegah klik */
        background-color: rgba(255, 255, 255, 0.7); /* Latar belakang sedikit lebih transparan */
    }

    .page-item .page-link:hover {
        background-color:rgb(247, 236, 235); /* Warna hover (pink sangat muda) */
        border-color: rgb(246, 226, 231); /* Border saat hover */
        color: #CD5C5C; /* Warna teks saat hover */
    }

    /* Ini memastikan sudut membulat di ujung pagination jika tanpa margin */
    /* Jika Anda punya margin: 0 4px; di .page-item .page-link, ini mungkin tidak terlalu terlihat */
    .pagination .page-item:first-child .page-link {
        border-top-left-radius: 8px;
        border-bottom-left-radius: 8px;
    }

    .pagination .page-item:last-child .page-link {
        border-top-right-radius: 8px;
        border-bottom-right-radius: 8px;
    }

    </style>
</head>

<body>
    <div class="jumbotron text-center mx-auto">
        <h1 style="color: white">5026231182 : Sahilah Amru</h1>
    </div>

    <nav class="navbar navbar-expand-sm justify-content-center" style="background-color: #fffef4">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">All Front End</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/pegawai">Pegawai</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/AC">Tugas CRUD</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">EAS</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Latihan 1</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Latihan 2</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Latihan 3</a>
            </li>
        </ul>
    </nav>
    <br>
    <div class="container">
        @yield('content')
    </div>

</body>

</html>
