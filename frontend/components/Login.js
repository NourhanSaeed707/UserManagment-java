import { signIn } from "next-auth/react";
import React from "react";
import Navbar from "./Navbar";
// import { GoogleLoginButton } from "react-social-login-buttons";
// import { LoginSocialGoogle } from "reactjs-social-login";

const Login = () => {
  return (
    <div>
      <Navbar />
      <div className="container mx-auto my-8">
        <div className="h-12">
          <button
            onClick={signIn}
            className="rounded bg-blue-600 text-white px-6 py-2 font-semibold"
          >
            Sign In
          </button>
          {/* <div>
            <LoginSocialGoogle
              client_id={
                "1036714888865-2nf3ov7j02l1i2jf7jsfcf23kb5g2q7f.apps.googleusercontent.com"
              }
              scope="openid profile email"
              discoveryDocs="claims_supported"
              access_type="offline"
              onResolve={({ provider, data }) => {
                // console.log(provider, data);
                console.log("here");
              }}
              onReject={(err) => {
                // console.log(err);
              }}
            >
              <GoogleLoginButton />
            </LoginSocialGoogle>
          </div> */}
        </div>
      </div>
    </div>
  );
};

export default Login;
