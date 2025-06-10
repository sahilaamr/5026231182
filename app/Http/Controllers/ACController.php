<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class ACController extends Controller
{
    //
    public function index2()
    {
        // mengambil data dari table AC
        //$AC = DB::table('AC')->get(); //array all record
        $AC = DB::table('AC')->paginate(10);

    	// mengirim data AC ke view index2
        return view('index2',['AC' => $AC]);

    }

    // method untuk menampilkan view form tambah AC
    public function tambah2()
    {

        // memanggil view tambah
        return view('tambah2');
    }

    // method untuk insert data ke table AC
    public function store(Request $request)
    {
        // Konversi nilai 'tersedia' dari checkbox
        // $request->has('tersedia') akan mengembalikan TRUE jika checkbox dicentang, FALSE jika tidak.
        $isTersedia = $request->has('tersedia');

        // insert data ke table AC
        DB::table('AC')->insert([
            'merkAC' => $request->merk,
            'hargaAC' => $request->harga,
            'tersedia' => $isTersedia,
            'berat' => $request->berat
        ]);
        // alihkan halaman ke halaman AC
        return redirect('/AC');
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

    // method untuk edit data AC
    public function edit2($id) // ada primary key
    {
        // mengambil data AC berdasarkan id yang dipilih
        $AC = DB::table('AC')->where('AC_ID',$id)->get();
        // passing data AC yang didapat ke view edit.blade.php
        return view('edit2',['AC' => $AC]);

    }

    // update data AC
    public function update(Request $request)
    {
        // Konversi nilai 'tersedia' dari checkbox
        // $request->has('tersedia') akan mengembalikan TRUE jika checkbox dicentang, FALSE jika tidak.
        $isTersedia = $request->has('tersedia');

        // update data AC
        DB::table('AC')->where('ID',$request->id)->update([
            'merkAC' => $request->merk,
            'hargaAC' => $request->harga,
            'tersedia' => $isTersedia,
            'berat' => $request->berat
        ]);
        // alihkan halaman ke halaman AC
        return redirect('/AC');
    }

    // method untuk hapus data AC
    public function hapus($id)
    {
        // menghapus data AC berdasarkan id yang dipilih
        DB::table('AC')->where('AC_ID',$id)->delete();

        // alihkan halaman ke halaman AC
        return redirect('/AC');
    }

    // method untuk mencari AC
    public function cari(Request $request)
	{
		// menangkap data pencarian
		$cari = $request->cari;

    		// mengambil data dari table AC sesuai pencarian data
		$AC = DB::table('AC')
		->where('merk_AC','like',"%".$cari."%")
		->paginate();

    		// mengirim data AC ke view index2
		return view('index2',['AC' => $AC]);

	}
}
