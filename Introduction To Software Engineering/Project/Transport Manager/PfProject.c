#include<stdio.h>
#include<string.h>

//void printVehicles();

struct specs{
	char serial[7];
	char route;
	int capacity;
};

void store(struct specs detail[]){
	
	FILE *fptr1 = fopen("noVehicles.txt","r");
	int noVehicles = 0;
	fscanf(fptr1,"%d",&noVehicles);
	fclose(fptr1);
	
	int i=0;
	
	FILE *fptr = fopen("data.txt","r");
	for(i=0; i<noVehicles; i++){
		fscanf(fptr,"%s",&detail[i].serial);
		fscanf(fptr," %c",&detail[i].route);
		fscanf(fptr,"%d",&detail[i].capacity);
	}
	fclose(fptr);
}

void readData(struct specs detail[]){
	printf("Route:\nSeial no.:\nCapacity:\n");
	FILE *fptr1 = fopen("noVehicles.txt","r");
	int noVehicles = 0;
	fscanf(fptr1,"%d",&noVehicles);
	fclose(fptr1);
	int i=0;
	char c;
	
	store(detail);
	
	FILE *fptr = fopen("data.txt","r");
	while(i <= (noVehicles*10)+(noVehicles*3)){
		
		c=fgetc(fptr);
		printf("%c", c);
		i++;
			
	}
	fclose(fptr);
}

int main(){
	
	struct specs detail[50];
    int i, n=0, max=0;
    char notice[500] = "All the buses will be on time today.";
	char yn = 'y';
	char ans = 'y';
	FILE *fptr1 = fopen("noVehicles.txt","r");
	int number = 0;
	fscanf(fptr1,"%d",&number);
	fclose(fptr1);
	
	while(yn == 'y'){
	int a;
	printf("TRANSPORT MANAGEMENT SYSTEM\n");
	printf("\n1.Admin Login");
	printf("\n2.User Login");
	printf("\n3.Notice\n");
	scanf("%d", &a);
	if(a==1){
		printf("\nAdministrator\n");
		char password[7] = "abc123";
		char adminpass[7];
		printf("\nEnter Password : ");
		scanf(" %s", adminpass);
		if((strcmp(password,adminpass)==0)){
			int b;
		    printf("\n1.Add vehicle");
		    printf("\n2.Show all vehicles");
		    printf("\n3.Add Notice\n");
		    scanf("%d", &b);
		    if(b==1){
		    	
		    	printf("\nHow many vehicles you want to add : ");
		    	scanf("%d", &n);
		    	max += n;
		    	
		    	FILE *fptr1 = fopen("noVehicles.txt","r");
				int noVehicles = 0;
				fscanf(fptr1,"%d",&noVehicles);
				fclose(fptr1);
				
				FILE *fptr2 = fopen("noVehicles.txt","w");
				noVehicles += n;
				fprintf(fptr2,"%d",noVehicles);
				fclose(fptr2);
				
				FILE *fptr = fopen("data.txt","a");
				
		    	if(max<50){
                for(i=0;i<n ;i++){
                printf("Enter the detail of vehicle %d\n", i+1);
                fflush(stdin);
                printf("Enter the serial number of vehicle %d: ",i+1);
                scanf(" %s",&detail[i].serial);
                fprintf(fptr,"%s\n",detail[i].serial);
                printf("Enter the route of vehicle %d: ",i+1);
                scanf(" %c",&detail[i].route);
                fprintf(fptr,"%c\n",detail[i].route);
                printf("Enter the capacity of vehicle %d: ",i+1);
                scanf("%d",&detail[i].capacity);
                fprintf(fptr,"%d\n",detail[i].capacity);
                }
                
                fclose(fptr);
                
                printf("\nAdd more (y/n):");
                scanf(" %c", &ans);
			}
		else{
			printf("\nLimit reached");
		}
	}
			else if(b==2){
				readData(detail);
			}  
			else if(b==3){
				printf("\nEnter Notice :");
				scanf(" %s", notice);
			}
	    }
	}
	else if(a==2){
		int c;
		printf("\nUser");
		printf("\n1.Show all vehicles");
		printf("\n2.Show all route details");
		printf("\n3.Book a seat\n");
		scanf("%d", &c);
		if(c==1){
			readData(detail);
		}  
		else if(c==2){
			printf("\nRoute A : FAST to Tower");
			printf("\nRoute B : FAST to Nazimabad");
			printf("\nRoute C : FAST to Gulshan e Hadeed");
			printf("\nRoute D : FAST to Gulistan e Johar");
			printf("\nRoute E : FAST to Gulshan e Iqbal");
			printf("\nRoute F : FAST to Malir Cantt");
			printf("\nRoute G : FAST to Korangi");
		}
		else if(c==3){
			store(detail);
			char route;
			fflush(stdin);
			printf("Enter your route (A-G) :");
			scanf(" %c", &route);
			for(i=0;i<number;i++){
				if(detail[i].route == route){
					printf("\nSeat booked in Bus %s\n", detail[i].serial);
					detail[i].capacity--;
					break;
				}
			}
			if(route > 72 || route < 65){
				printf("Invalid");
			}
	}
}
	else if(a==3){
		printf("\nNOTICE :\n");
		puts(notice);
	}
	else if(a!=1 || a!=2 || a!=3){
		printf("\nInvalid Input");
	}
	printf("\nDo you want to continue (y/n) :");
	scanf(" %c", &yn);
}

return 0;
}

