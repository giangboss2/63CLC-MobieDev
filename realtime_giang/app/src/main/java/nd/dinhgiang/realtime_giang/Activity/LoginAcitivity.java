package nd.dinhgiang.realtime_giang.Activity;

import androidx.appcompat.app.AppCompatActivity;

public class LoginAcitivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Initiation();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();
                loginUser(txt_email,txt_password);
            }
        });
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginAcitivity.this,RegisterActivity.class));
            }
        });
    }

    private void loginUser(String email, String password) {
        auth.signInWithEmailAndPassword(email, password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(LoginAcitivity.this,"Login successfully!",Toast.LENGTH_LONG).show();
                startActivity(new Intent(LoginAcitivity.this,MainActivity.class));
                finish();
            }
        });
    }


    private void Initiation() {
        email = findViewById(R.id.edittext_email);
        password = findViewById(R.id.edittext_password);
        login = findViewById(R.id.login_button);
        createAccount= findViewById(R.id.logtosign);
        auth = FirebaseAuth.getInstance();
    }

    private EditText email;
    private EditText password;
    private Button login;
    private FirebaseAuth auth;
    private TextView createAccount;
}
