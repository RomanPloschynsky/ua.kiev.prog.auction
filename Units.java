
public class Units {
        public static enum units {
            CT("шт"),KG("кг");

            units(String description) {
                this.description = description;
            }

            private String description;

            @Override
            public String toString() {
                return description;
            }
        }
}
