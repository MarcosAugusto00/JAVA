package calculo_bolos;

public class Bolos {
	double ovo = 14.90 / 30;
	double litro_leite = 4.99;
	double oleo_900ml = 6.68;
	double acucar_1kg = 16.49 / 5;
	double trigo_1kg = 13.69 / 5;
	double fuba_1kg = 18.99 / 5;
	double fermento_1kg = 49.90 / 2;
	double coco_1kg = 25.50;
	double saborizante_1kg = 4.00 * 10;
	
	public double bolo_trigo() {
		double total = ovo * 2;
		total += ((litro_leite/1000) * 130);
		total += ((oleo_900ml/900) * 67);
		total += ((acucar_1kg/1000) * 314);
		total += ((trigo_1kg/1000) * 343);
		total += ((fermento_1kg/1000) * 15);
		return total;
	}
	
	public double bolo_fuba() {
		double total = ovo * 2;
		total += ((litro_leite/1000) * 130);
		total += ((oleo_900ml/900) * 139);
		total += ((acucar_1kg/1000) * 314);
		total += ((trigo_1kg/1000) * 130);
		total += ((fermento_1kg/1000) * 15);
		total += ((fuba_1kg/1000) * 213);
		return total;
	}
	
	public double bolo_sabor() {
		double total = ovo * 2;
		total += ((litro_leite/1000) * 130);
		total += ((oleo_900ml/900) * 67);
		total += ((acucar_1kg/1000) * 314);
		total += ((trigo_1kg/1000) * 343);
		total += ((fermento_1kg/1000) * 15);
		total += ((saborizante_1kg/1000) * 14);
		total += ((coco_1kg/1000) * 30);
		return total;
	}
	
	public double bolo_laranja() {
		double total = ovo * 2;
		total += ((litro_leite/1000) * 130);
		total += ((oleo_900ml/900) * 67);
		total += ((acucar_1kg/1000) * 314);
		total += ((trigo_1kg/1000) * 343);
		total += ((fermento_1kg/1000) * 15);
		total += ((saborizante_1kg/1000) * 14);
		return total;
	}
}

