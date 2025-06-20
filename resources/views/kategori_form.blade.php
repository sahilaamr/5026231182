@extends('template')
@section('content')

    <h3>Pilih Kategori</h3>

    <p>Pilih Kategori:</p>
    <form method="POST" action="{{ route('kategori.kirim') }}">
        @csrf
        <select name="kategori">
            @foreach($kategori as $item)
                <option value="{{ $item->ID }}">{{ $item->Nama }}</option>
            @endforeach
        </select>
        <button type="submit">KIRIM</button>
    </form>

    @endsection
