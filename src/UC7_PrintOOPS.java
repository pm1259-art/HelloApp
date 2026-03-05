public class UC7_PrintOOPS {
    static class CharacterPatternMap{
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern){
            this.character=character;
            this.pattern=pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }

        public static CharacterPatternMap[] createCharacterPatternMaps(){
            CharacterPatternMap[] characterPatternMap =new CharacterPatternMap[4];
            characterPatternMap[0]=new CharacterPatternMap('O', new String[]{
                    " ***** ", "*     *", "*     *", "*     *", "*     *", "*     *", " ***** "
            });
            characterPatternMap[1]=new CharacterPatternMap('P', new String[]{
                    " ***** ", "*     *", "*    *", " ***** ", "*      ", "*      ", "*      "
            });
            characterPatternMap[2]=new CharacterPatternMap('S', new String[]{
                    " ***** ", "*      ", "*      ", " ***** ", "      *", "      *", " ***** "
            });
            return characterPatternMap;
        }
        public static String[] getCharacterPatterns(char ch, CharacterPatternMap[] charMaps){
            for (CharacterPatternMap map: charMaps){
                if (map.getCharacter()==ch){
                    return map.getPattern();
                }
            }
            return getCharacterPatterns(' ', charMaps);
        }
        public static void printMessage(String message, CharacterPatternMap[] charMaps){
            for (int i = 0; i < 7; i++) {
                StringBuilder lineAssembler=new StringBuilder();
                for (char ch: message.toCharArray()){
                    String[] pattern = getCharacterPatterns(ch, charMaps);
                    lineAssembler.append(pattern[i]).append(" ");
                }
                System.out.println(lineAssembler.toString());
            }
        }
        public static void main(String[] args){
            CharacterPatternMap[] charMaps=createCharacterPatternMaps();
            String message="OOPS";
            printMessage(message, charMaps);
        }
    }
}
