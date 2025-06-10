@extends('template')
@section('content')

	<h3>Data AC</h3>

	<a href="/AC/tambah" class="btn" style="background-color: rgb(246, 226, 231); color:white"> + Tambah AC Baru</a>
    <br/><br/>

	<p>Cari Data AC :</p>
	<form class="form-inline" action="/AC/cari" method="GET">
    <input type="text" class="form-control mr-2 mb-2" name="cari" placeholder="Cari AC ..">
    <button type="submit" class="btn btn-info mb-2">CARI</button>
    </form>
	<br/>

	<table class="table table-stripped">
		<tr>
			<th>Merk</th>
			<th>Harga</th>
			<th>Tersedia</th>
			<th>Berat</th>
            <th>Opsi</th>
		</tr>
		@foreach($AC as $p)
		<tr>
			<td>{{ $p->merkAC }}</td>
			<td>Rp {{ number_format($p->hargaAC, 0, ',', '.') }}</td>
			<td>{{ $p->tersedia ? 'Tersedia' : 'Tidak Tersedia' }}</td>
			<td>{{ $p->berat }}</td>
			<td>
				<a href="/AC/edit/{{ $p->ID }}" class="btn btn-success">Edit</a>
				|
				<a href="/AC/hapus/{{ $p->ID }}" class="btn btn-danger">Hapus</a>
			</td>
		</tr>
		@endforeach
	</table>
    {{ $AC->links()}}

@endsection
