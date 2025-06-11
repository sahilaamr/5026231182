<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class KeranjangBelanjaController extends Controller
{
    //
    public function index3()
    {
        // mengambil data dari table keranjang_belanja
        $keranjang_belanja = DB::table('keranjang_belanja')->paginate(10);

    	// mengirim data keranjang_belanja ke view index3
        return view('index3',['keranjang_belanja' => $keranjang_belanja]);

    }

    // method untuk menampilkan view form beli keranjang_belanja
    public function beli()
    {

        // memanggil view beli
        return view('beli');
    }

    // method untuk insert data ke table keranjang_belanja
    public function store(Request $request)
    {
        $validated = $request->validate([
        'kode_barang' => 'required|integer',
        'jumlah_pembelian' => 'required|integer|min:1',
        'harga_per_item' => 'required|integer|min:1',
    ]);

    $total = $validated['jumlah_pembelian'] * $validated['harga_per_item'];

        // insert data ke table keranjang_belanja
        DB::table('keranjang_belanja')->insert([
            'kode_barang' => $request->kode_barang,
            'jumlah_pembelian' => $request->jumlah_pembelian,
            'harga_per_item' => $request->harga_per_item,
            'total' => $total
        ]);
        // alihkan halaman ke halaman keranjang_belanja
        return redirect('/keranjang_belanja');
    }

    /* public function proses(Request $request)
    {
    $this->validate($request,[
        'nama' => 'required|min:5|max:20',
        'pekerjaan' => 'required',
        'usia' => 'required|numeric'
    ]);

    return view('proses',['data' => $request]);
    } */

    // update data keranjang_belanja
    public function update(Request $request)
    {
        // update data keranjang_belanja
        DB::table('keranjang_belanja')->where('ID',$request->id)->update([
            'kode_barang' => $request->kode_barang,
            'jumlah_pembelian' => $request->jumlah_pembelian,
            'harga_per_item' => $request->harga_per_item,
        ]);
        // alihkan halaman ke halaman keranjang_belanja
        return redirect('/keranjang_belanja');
    }

    // method untuk membatalkan data keranjang_belanja
    public function batal($id)
    {
        // menghapus data keranjang_belanja berdasarkan id yang dipilih
        DB::table('keranjang_belanja')->where('ID',$id)->delete();

        // alihkan halaman ke halaman keranjang_belanja
        return redirect('/keranjang_belanja');
    }
}
