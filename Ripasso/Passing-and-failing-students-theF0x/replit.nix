{ pkgs }: {
	deps = [
		pkgs.clang_12
    pkgs.ruby
		pkgs.ccls
		pkgs.gdb
		pkgs.gnumake
	];
}