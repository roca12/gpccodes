#include <cstdio>

int main()
{
  int T;
  scanf("%d", &T);
  while (T--) {
    int a1, a2, a3, a4, a5;
    scanf("%d %d %d %d %d", &a1, &a2, &a3, &a4, &a5);
    puts(
      (a1 == 1 && a2 == 2 && a3 == 3 && a4 == 4 && a5 == 5 ||
      a1 == 2 && a2 == 3 && a3 == 4 && a4 == 5 && a5 == 6) ? "Y" : "N");
  }
  return 0;
}