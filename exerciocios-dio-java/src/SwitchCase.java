public class SwitchCase {
    public static void main(String[] args) {
        
        // Modo condicional if/else
	    /*
	    String sigla = "M";

	 	if(sigla == "P")
    	    System.out.println("PEQUENO");
	    else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
	 		System.out.println("GRANDE");
	    else
			System.out.println("INDEFINIDO");	
        */

        
        // Modo condicional switch / case	
        String sigla = "G";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
        case "M":
        case "m":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":
        case "g":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}



        // Modo condicional convencional
		/*
        String plano = "M"; //M / T
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
        */

        
        // Modo condicional switch/case
		String plano = "M"; // M / T
		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}

