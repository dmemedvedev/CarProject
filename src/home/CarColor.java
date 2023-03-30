package home;


    public enum CarColor {
        COLOR1("BLUE"),
        COLOR2("RED" ),
        COLOR3( "WHITE");

        private String colorName;
        private CarColor(String colorName) {
            this.colorName = colorName;
        }
        public String getColorName() {

            return colorName;
        }
    }

