@extends('template')
@section('content')

<h2>Data Mahasiswa (Read Only)</h2>
<p>NRP: {{ $mhs->NRP }}</p>
<p>Nama: {{ $mhs->Nama }}</p>
<p>Jurusan: {{ $mhs->Jurusan }}</p>
<p>IPK: {{ $mhs->IPK }}</p>

@endsection
