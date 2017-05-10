class putra extends mahasiswa{
	//override
	protected void kuliah(String nama){
		System.out.println("Saya " +nama);
		System.out.println("Saya berangkat kuliah dengan penuh cinta");
		System.out.println("Lalu mengantuk ditengah perkuliahan");
	}
	//override
	protected void lulus(){
		System.out.println();
		System.out.println("jika saya lulus, hutami menemani saya wisuda. (cieeeee)");
	}
	//override
	protected void tdklulus(){
		System.out.println("Saya tidak mau tidak lulus");
	}
}