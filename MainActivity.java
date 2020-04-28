public class MainActivity extends AppCompatActivity {

   //↓呢行係加個 button variable(變數)
   Button button;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      //↓呢行係連接個變數去 activity_main.xml 既 button 既 id (假設你已經在 xml file 加左一個 button)
      //因為佢唔知個 button 變數代表什麼，所以要加呢段 code
      button = findViewById(R.id.button);

      //↓下面三行係加個功能令你 click 個 button 後會彈出另一個版面(NewActivity)
      buttonToClick.setOnClickListener(new View.OnClickListener() {
         startactivity(new Intent(MainActivity.this, NewActivity.class))
      });
      //除左 Button, 以上 code 都可以用喺 View/TextView/ImageView 等等
      //只需要改個變數類型就得 e.g. (在第4行)由 Button button; 改做 ImageView button;
   
}
