package clasesAbstractas.dominioAbstracto;

public abstract class FiguraGeometrica {
	
		protected String tipoFigura;
		
		protected FiguraGeometrica(String tipoFigura) {
			this.tipoFigura = tipoFigura;
			
		}
		
		public abstract void dibujar();



		/**
		 * @return the tipoFigura
		 */
		public String getTipoFigura() {
			return tipoFigura;
		}

		/**
		 * @param tipoFigura the tipoFigura to set
		 */
		public void setTipoFigura(String tipoFigura) {
			this.tipoFigura = tipoFigura;
		}

		@Override
		public String toString() {
			return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
		} 
			
			
		
		}
	

