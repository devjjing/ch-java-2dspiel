public class Test2D {
    public static void main(String[] args){

        @Test
        void playerCharacterTest_whengetx_thenReturn0() {

            //GIVEN
            int number = 0;

            //WHEN
            int actual = Test2D.Test(number);

            //THEN
            AssertEquals(expected:0, actual);
        }
    }
}
