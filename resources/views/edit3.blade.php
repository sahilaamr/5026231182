@extends('template')
@section('content')

<h2>Edit Mahasiswa</h2>
<form action="/mahasiswa/update/{{ $mhs->NRP }}" method="POST">
    @csrf
    Nama: <input type="text" name="Nama" value="{{ $mhs->Nama }}"><br><br>
    Jurusan: <input type="text" name="Jurusan" value="{{ $mhs->Jurusan }}"><br><br>
    IPK: <input type="text" name="IPK" value="{{ $mhs->IPK }}"><br><br>
    <button type="submit">Simpan</button>
</form>

@endsection
