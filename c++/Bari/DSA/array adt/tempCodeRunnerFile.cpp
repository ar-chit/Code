if (K[arr->A[i] - low] == 0) {
      K[arr->A[i] - low]++;
      if (k - arr->A[i] != arr->A[i] && K[(k - arr->A[i]) - low] == 1) {
        cout << arr->A[i] << " + " << k - arr->A[i] << " = " << k << endl;
      }
    }