@extends('template')
@section('content')

	<h3>Keranjang Belanja</h3>

    <br/><br/>

	<br/>

	<table class="table table-stripped">
		<tr>
            <th>Kode Pembelian</th>
			<th>Kode Barang</th>
			<th>Jumlah Pembelian</th>
            <th>Harga per item</th>
            <th>Total</th>
            <th>Action</th>
		</tr>
		@foreach($keranjang_belanja as $p)
		<tr>
            <td>{{ $p->ID }}</td>
			<td>{{ $p->kode_barang }}</td>
            <td>{{ $p->jumlah_pembelian }}</td>
			<td>Rp {{ number_format($p->harga_per_item, 0, ',', '.') }}</td>
            <td>Rp {{ number_format($p->jumlah_pembelian * $p->harga_per_item, 0, ',', '.')}}</td>
			<td>
				<a href="/keranjang_belanja/beli" class="btn btn-success">Beli</a>
				|
				<a href="/keranjang_belanja/batal/{{ $p->ID }}" class="btn btn-danger">Batal</a>
			</td>
		</tr>
		@endforeach
	</table>
    {{ $keranjang_belanja->links()}}

@endsection
