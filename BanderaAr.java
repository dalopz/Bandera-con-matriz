public class BanderaAr{
	public static void main(String[] args) {
		char bandera [][];
		bandera = new char [30][100];
		//stos valores son para separar las celdas en donde irá el sol
		bandera[11][48] = 'S';
		bandera[11][49] = 'S';
		bandera[11][50] = 'S';
		bandera[12][47] = 'S';
		bandera[12][48] = 'S';
		bandera[12][49] = 'S';
		bandera[12][50] = 'S';
		bandera[12][51] = 'S';
		bandera[13][46] = 'S';
		bandera[13][47] = 'S';
		bandera[13][48] = 'S';
		bandera[13][49] = 'S';
		bandera[13][50] = 'S';
		bandera[13][51] = 'S';
		bandera[13][52] = 'S';
		bandera[14][46] = 'S';
		bandera[14][47] = 'S';
		bandera[14][48] = 'S';
		bandera[14][49] = 'S';
		bandera[14][50] = 'S';
		bandera[14][51] = 'S';
		bandera[14][52] = 'S';
		bandera[15][46] = 'S';
		bandera[15][47] = 'S';
		bandera[15][48] = 'S';
		bandera[15][49] = 'S';
		bandera[15][50] = 'S';
		bandera[15][51] = 'S';
		bandera[15][52] = 'S';
		bandera[16][47] = 'S';
		bandera[16][48] = 'S';
		bandera[16][49] = 'S';
		bandera[16][50] = 'S';
		bandera[16][51] = 'S';
		bandera[17][48] = 'S';
		bandera[17][49] = 'S';
		bandera[17][50] = 'S';

		//color azul primera parte
		for (int i = 0; i<10;i++){
			for(int j = 0; j<bandera[0].length; j++){
				bandera[i][j]= 'A';
			}
		}
		
		//color blanco parte mitad de la bandera	
		for (int i = 10; i<20; i++){
			//ciclo para que no sobreescriba el color blanco las celdas que son para el sol
			for(int j = 0; j<bandera[0].length; j++){
				if( bandera[i][j] != bandera[11][48] &&
					bandera[i][j] != bandera[11][49] &&
					bandera[i][j] != bandera[11][50] &&
					bandera[i][j] != bandera[12][47] &&
					bandera[i][j] != bandera[12][48] &&
					bandera[i][j] != bandera[12][49] &&
					bandera[i][j] != bandera[12][50] &&
					bandera[i][j] != bandera[12][51] &&
					bandera[i][j] != bandera[13][46] &&
					bandera[i][j] != bandera[13][47] &&
					bandera[i][j] != bandera[13][48] &&
					bandera[i][j] != bandera[13][49] &&
					bandera[i][j] != bandera[13][50] &&
					bandera[i][j] != bandera[13][51] &&
					bandera[i][j] != bandera[13][52] &&
					bandera[i][j] != bandera[14][46] &&
					bandera[i][j] != bandera[14][47] &&
					bandera[i][j] != bandera[14][48] &&
					bandera[i][j] != bandera[14][49] &&
					bandera[i][j] != bandera[14][50] &&
					bandera[i][j] != bandera[14][51] &&
					bandera[i][j] != bandera[14][52] &&
					bandera[i][j] != bandera[15][46] &&
					bandera[i][j] != bandera[15][47] &&
					bandera[i][j] != bandera[15][48] &&
					bandera[i][j] != bandera[15][49] &&
					bandera[i][j] != bandera[15][50] &&
					bandera[i][j] != bandera[15][51] &&
					bandera[i][j] != bandera[15][52] &&
					bandera[i][j] != bandera[16][47] &&
					bandera[i][j] != bandera[16][48] &&
					bandera[i][j] != bandera[16][49] &&
					bandera[i][j] != bandera[16][50] &&
					bandera[i][j] != bandera[16][51] &&
					bandera[i][j] != bandera[17][48] &&
					bandera[i][j] != bandera[17][49] &&
					bandera[i][j] != bandera[17][50]  )
				{
					bandera[i][j] = 'B';
				}
				
			}
			
		}	

		// color azul final bandera
		for(int i = 19; i<bandera.length -1 ; i++){ // (bandera.length-1) para que quedara la misma cantidad de la franja azul arriba y abajo
			for (int j = 0 ; j<bandera[0].length ; j++){
				bandera[i][j] = 'A';
				//System.out.print(bandera[k][l]);
			}
		}
		for (int i=0;i<bandera.length ;i++ ) {

		 	for (int j=0;j<bandera[0].length ;j++ ) {
		 		if(bandera[i][j]=='A')
		 		{
		 			System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");//pintar azul " " las celdas A
		 		}
		 		if(bandera[i][j]=='B')
		 		{
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");//pintar blanco " " las celdas B
		 		}
		 		if(bandera[i][j]=='S')
		 		{
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");//pintar amarillo " " las celdas S (sol)
		 		}
		 		
		 		System.out.print(ConsoleColors.RESET);
		 	}
		 	System.out.println();
		 }

				
	}
}
